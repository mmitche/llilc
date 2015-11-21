// Import the utility functionality.
import jobs.generation.Utilities;

// Grab the github project name passed in
def project = GitHubProject

//**************
// *Nix builds
//**************

[true, false].each { isPR ->
    ['debug', 'release'].each { configuration ->
        
    }
}