import java.util.Scanner;
import static java.lang.System.*;

class Room {
	int roomNumber;
	String roomName;
	String description;
	int numExits;
	String[] exits = new String[10];
	int[] destinations = new int[10];
}

public class TextAdventure {

	public static Room[] loadRoomsFromFile(String filename) {
		Scanner file = null;
		try {
			file = new Scanner(new java.io.File(filename));
		} catch(java.io.IOException e) {
			err.println("Can't open '" + filename + "' for reading.");
			exit(1);
		}

		// initialize rooms from file
		int numRooms = file.nextInt();
		Room[] rooms = new Room[numRooms];
		int roomNum = 0;

		while (file.hasNext()) {
			Room r = getRoom(file);
			if (r.roomNumber != roomNum) {
				err.print("Just read room # " + r.roomNumber);
				err.println(", but " + roomNum + " was expected.");
				exit(2);
			}
			rooms[roomNum] = r;
			roomNum++;
		}
		file.close();

		return rooms;
	}

	public static void showAllRooms(Room[] rooms) {
		for (Room r : rooms) {
			String exitString = "";
			for(int i=0; i<r.numExits; i++) {
				exitString += "\t" + r.exits[i] + " (" + r.destinations[i] + ")";
			}
			out.println(r.roomNumber + ") " + r.roomName);
			out.println(exitString);
		}
	}

	public static Room getRoom(Scanner f) {
		// any rooms left in the file?
		if(! f.hasNextInt()) {
			return null;
		}
		Room r = new Room();
		String line;
		// read in the room # for error-checking later
		r.roomNumber = f.nextInt();
		f.nextLine();
		// skip "\n" after room #
		r.roomName = f.nextLine();
		// read in the room's description
		r.description = "";
		while(true) {
			line = f.nextLine();
			if(line.equals("%%")) {
			break;
			}
		r.description += line + "\n";
		}

		// finally, we'll read in the exits
		int i = 0;
		while(true) {
			line = f.nextLine();
			if(line.equals("%%")) {
				break;
			}
			String[] parts = line.split(":");
			r.exits[i] = parts[0];
			r.destinations[i] = Integer.parseInt(parts[1]);
			i++;
		}
		r.numExits = i;
		// should be done; return the Room
		return r;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(in);
		// initialize rooms from file
		Room[] rooms = loadRoomsFromFile("text_adventure_rooms.txt");
		 showAllRooms(rooms); // for debugging
		// Okay, so let's play the game!
		int currentRoom = 0;
		String ans;
		while(currentRoom >= 0) {
			Room cur = rooms[currentRoom];
			out.print(cur.description);
			out.print("> ");
			ans = keyboard.nextLine();

			// See if what they typed matches any of our exit names
			boolean found = false;
			for(int i=0; i<cur.numExits; i++) {
				if(cur.exits[i].equals(ans)) {
				// if so, change our next room to that exit's room number
				currentRoom = cur.destinations[i];
				found = true;
				}
			}
			if(! found)
				out.println("Sorry, I don't understand.");
		}
	}
}
