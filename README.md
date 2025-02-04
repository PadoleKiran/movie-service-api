Steps: (low level design)

1. Identify the domain objects
    - User(id, name, email, phone, etc)
    - Admin(id, name, email, phone, rights, etc)
    - movies(id, title, genre, release date, cast, director, ratings, reviews)

2. Identify the users persona who are goingg to interact with our system
    - User
    - Admin

3. Identify the features to be provided
    - listing of movies
    - search information of movies by title, genre, release date, cast, director

4. Identify the data/object storage requirement -
   i. in memory


5. Identify the service that you will be providing

   a. MovieService
   - add (not duplicate records)
   - update
   - delete
   - search
