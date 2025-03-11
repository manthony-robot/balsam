Project Description: Balsam Shopping Cart Updates feature

Framework setup and dependencies:
    1. Download JDK (Amazon Corretto is used for this project).
    2. Install chocolatey
        Perform the ff. commands in the secure shell:
            Set-ExecutionPolicy Bypass -Scope Process -Force
            iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
        Verify installed chocolatey:
            choco -v
    3. Install Maven using chocolatey
        Perform the ff. commands in the secure shell:
            choco install maven     *Select YES for any prompts*
        Verify message:
            Deployed to 'C:\ProgramData\chocolatey\lib\maven\apache-maven-3.9.9'
    4. Install VSCode
    5. Add the ff. extensions in VSCode
            Java Extension Pack     *Install necessary resources for Java development*
    6. Access Git and create a repository
        Click Code > HTTPS tab > take note of the repository URL
    7. Download and install Git Bash
    7. Create a 'Code' folder in Windows Explorer
    8. Copy Repository to local
        Access created Code folder > right-click > Open Git Bash here
        enter: git clone <repository URL>   
    9. Add dependencies in the POM.xml file (Please refer to POM.xml for added dependencies)
        - add Selenium dependency
        - add WebDriver dependency
    