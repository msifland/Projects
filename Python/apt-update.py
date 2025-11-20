from subprocess import call #for the below expample of 'call'
import os
import subprocess #for the below example of 'subprocess.run'
import io
from contextlib import chdir
import time

print("Running apt update first...")
time.sleep(1)
subprocess.run(["sudo","apt","update"])
print()
print("Runing apt upgrade")
time.sleep(1)
call(["sudo","apt","upgrade","-y"])
time.sleep(1)
# empty input catch
def get_empty_input(prompt):
	while True:
		user_input = input(prompt)
		#check if empty
		if user_input.strip():
			return user_input
		else:
			print("You entered nothing, please try again.")
			time.sleep(1)

def update_git_repo(repo_path):
	"""
	Changes directory to specified repo_path and runs git pull
	Args:
		repo_path(str): Absolute or relative path to git repo
	"""

	# Check if dir exists
	if not os.path.isdir(repo_path):
		print(f"Error: Not a directory for {repo_path}")
		return

	# Use chdir context manager to safeley change dir
	# and automatically return to original dir
	try:
		with chdir(repo_path):
			print(f"Changing dir to: {os.getcwd()}")
			print("Running 'git pull'...")
			time.sleep(1)

			# Execute git pull
			print("git fetch...")
			time.sleep(1)
			result1 = subprocess.run(["git","fetch"], capture_output=True, text=True, check=True)
			print("git fetch successful:")
			print(result1.stdout)
			print()
			time.sleep(1)
			print("git pull...")
			time.sleep(1)
			result2 = subprocess.run(["git","pull"], capture_output=True, text=True, check=True)
			print("git pull successful:")
			print(result2.stdout)
			print()
			time.sleep(1)

	except FileNotFoundError:
		print("Error: 'git' command not found. Ensure git is installed.")
	except subprocess.CalledProcessError as e:
		print(f"Error runnng git pull: {e.stderr}")
	except Exception as e:
		print(f"And undefined error occurred: {e}")

print()
repo_dir = get_empty_input("Enter full path of git dir you want to update: ")
# Example useage
# Replace with actual path to your local git repo
update_git_repo(repo_dir)

