use blog_db;
insert into users (username, email, password)
values(
          'BigParrot',
          'BirdGuy@email.com',
          'birds'
          ),(
          'DuckRainbow',
          'colors@email.com',
          'rainbow'
          ),(
          'NobleFlea',
          'bug@email.com',
          'password'
          ),(
          'TacoCat',
          'palindrome@email.com',
          'backwards'
          );

insert into posts(title, body, user_id)
values(
          'Hook me up with that al pastor',
          'Every day is taco ipsum tuesday. It’s raining tacos, from out of the sky, tacos, don’t even ask why. Tacos al pastor made with adobada meat. Give me tacos, or give me death.',
          1
          ),(
          'Yum yum yum, delicioso!',
          'Tacos dorados called flautas, or taquitos, for which the tortillas are filled with pre-cooked shredded chicken, beef or barbacoa, rolled into an elongated cylinder and deep-fried until crisp.',
          1
          ),(
          'Tacos are delicious',
          'I think my favorite food is tacos.  Like, I am SUPER into tacos.  I may enjoy them more than any other human who has ever lived.  Every day is taco ipsum tuesday.',
          4
          ),(
          'More tacos more problems',
          'Every day is taco ipsum tuesday. It’s a wonderful morning for breakfast tacos. Can you put some peppers and onions on that? Side of rice and beans, please. Tacos for breakfast, lunch and dinner.',
          3
          ),(
          'I''ve been chasing this taco truck all day.',
          'Every day is taco ipsum tuesday. How do you feel about hard shelled tacos? Can you put some peppers and onions on that? It’s a wonderful morning for breakfast tacos. Give me tacos, or give me death.',
          2
          ),(
          'I found a new restaurant',
          'Every day is taco ipsum tuesday. Tacos, again? This will be 5 times this week and it’s only Tuesday. Pico de gallo, on the side please. Yeah, apparently the taco shack was robbed.',
          4
          ),(
          'The tacOdyssey',
          'Every day is taco ipsum tuesday. Add in a few el Pastor with guac and diced onions. It’s long been rumored that the chupacabra is really just a crazed man who’s local taco shop went out of business.',
          1
          ),(
          'I''ve discovered a new recipe!',
          'Every day is taco ipsum tuesday. Tacos for breakfast, lunch and dinner. Say taco one more time. Fish tacos: lettuce or cabbage, pico de gallo, avocado and a sour cream or citrus/mayonnaise sauce.',
          2
          ),(
          'Taco Tuesday is a National holiday',
          'Tacos, again? This will be 5 times this week and it’s only Tuesday. BARBACOA!! CARNE ASADA!! Burritos are very tasty. It’s taco time all the time. Give me all your tacos. Make it a double there pal.',
          4
          );

insert into categories(name)
values(
          'Flour'),
      ('Corn'),
      ('Chicken'),
      ('Beef'),
      ('Pork'),
      ('Vegetarian'),
      ('Gluten Free'),
      ('Spicy'
          );

insert into posts_categories(post_id, category_id)
values(
          1,2
          ),(
          1,4
          ),(
          2,2
          ),(
          3,1
          ),(
          3,5
          ),(
          3,8
          ),(
          4,8
          ),(
          4,1
          ),(
          4,3
          ),(
          5,2
          ),(
          5,7
          ),(
          6,1
          ),(
          7,2
          ),(
          7,8
          ),(
          8,1
          ),(
          8,4
          ),(
          8,7
          ),(
          8,8
          ),(
          9,1
          ),(
          9,8
          );

