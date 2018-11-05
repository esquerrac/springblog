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
'I like birds',
'I think birds are the best.  But among all birds, the parrot is king.  The fanciful colors and peculiar speech ability are hallmarks of a truly noble winged animal',
1
),(
'My parrot bit me',
'Guys, I am seriously so sad.  My parrot bit me!  How could the bird I love betray me so!  I have failed my fine feathered friend.',
1
),(
'Tacos are delicious',
'I think my favorite food is tacos.  Like, I am SUPER into tacos.  I may enjoy them more than any other human who has ever lived.  Also I own a cat, and she is super sweet.',
4
),(
'google.com',
'Please help I try use the google and am now here.'
3
),(
'Fed Ducks for the first time!',
'I went to a local lake and fed the ducks bread.  I had a great time!  Ducks are such majestic creatures',
2
),(
'I found a new restaurant',
'A new tex-mex place opened near my house and their tacos were amazing!  I have seldom had a bad taco, but these tacos were seriously on another level.  Next time I go I will take pictures to post for you guys!',
4
),(
'Lost my finger',
'I went to the doctor today and they said they think I will lose my finger.  Parrot, why have you forsaken me?',
1
),(
'BREAD IS BAD FOR DUCKS?',
'Somebody told me bread is bad for ducks today?  Has anybody else ever heard of this?  Why would so many people feed them little pieces of bread if it was bad for them?  We should have been taught this in school!'
2
),(
'Crowdsourcing a new camera',
'How badly does everybody want taco pictures?  I kinda need a new camera...',
4
);

insert into categories(name)
values(
'Food',
'Pets',
'Games',
'Cars/Trucks',
'Music',
'Travel',
'Outdoors',
'Other'
);

insert into posts_categories(post_id, category_id)
values(
1,2
),(
2,2
),(
3,1
),(
4,8
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
8,2
),(
8,7
),(
8,8
),(
9,1
),(
9,8
);

