

The goal is to try to program simple http server in functional style.


It should. 
- accept json requests 
- process requests applying different business logic (it can be relatively complex so it should be separated) depending on request body
- be able to save some data from the request to local storage (for simplicity it can be inmem Map or List wrapped in some sort of Repository)
- respond with some data based on the request
