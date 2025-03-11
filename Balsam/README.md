Project Description: Balsam Shopping Cart Updates feature

Framework setup and dependencies:
    1. Download JDK (Amazon Corretto is used for this project).
    2. Install chocolatey
        - Perform the ff. commands in the secure shell:
            Set-ExecutionPolicy Bypass -Scope Process -Force
            iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
        - Verify installed chocolatey:
            choco -v
    3. Install Maven using chocolatey
        - Perform the ff. commands in the secure shell:
            choco install maven     *Select YES for any prompts*
        - Verify message:
            - Deployed to 'C:\ProgramData\chocolatey\lib\maven\apache-maven-3.9.9'
    4. Install VSCode
    5. Add the ff. extensions in VSCode
        - Add and install "Java Extension Pack "    *Install necessary resources for Java development*
    6. Access Git and create a repository
        - Click Code > HTTPS tab > take note of the repository URL
    7. Download and install Git Bash
    7. Create a 'Code' folder in Windows Explorer
    8. Copy Repository to local
        - Access created Code folder > right-click > Open Git Bash here
        - Perform the ff. command: git clone <repository URL>   
    9. Add dependencies in the POM.xml file (Please refer to POM.xml for added dependencies)
        - Add Selenium dependency
        - Add WebDriver dependency
    10. Download Google Chrome and chromedriver
        - The versions must be aligned in order to not have any issues when executing the script
        - Locate the extracted chromedriver and place it the same level as the "src" folder

Instructions to clone and execute the tests
    1. Access the attached link to the repository
    2. Click Code > HTTPS tab > Copy the repository URL
    3. Create a local folder and perform Git Bash within the created folder
    4. Enter the ff. command: git clone <repository URL>
    5. Execute the Java file
        - Access "test\java\com\balsam\login" folder
        - Right-click on the "ShoppingCartUpdates.java" file
        - Select "Run Java"
    
Expected test outputs
    1. A simple logger function is created to output essential informations in the command line.
    2. 

Github
    https://github.com/manthony-robot/balsam