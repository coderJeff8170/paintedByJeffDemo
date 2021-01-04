MERGE INTO `role` VALUES (1,'USER');
MERGE INTO `role` VALUES (2,'ADMIN');

merge into `product` values 
	(1, 
	'Pets', 
	'Painting of a dog',
	'12 x 12',
	'https://www.paintedbyjeff.com/assets/FullSize/Neyland12x12.jpg',
	'acrylic on canvas',
	'Neyland',
	300,
	false);
merge into `product` values 
	(2,
	'Snapshots', 
	'Painting of a boy with a fish',
	'16 x 12',
	'https://www.paintedbyjeff.com/assets/FullSize/FloridaBoy16x12.jpg',
	'acrylic on canvas',
	'Florida Boy',
	500,
	false);
merge into `product` values 
	(3, 
	'People', 
	'Painting of a woman with a dog',
	'18 x 24',
	'https://www.paintedbyjeff.com/assets/FullSize/ElizabethAnnabell18x24.jpg',
	'acrylic on canvas',
	'Elizabeth',
	800,
	false);

-- need to remove quantity and add a 'sold' boolean, dimensions string, media string. 
-- PRODUCT_ID  	CATEGORY  	DESCRIPTION  	DIMENSIONS  	IMAGE  	MEDIA  	NAME  	PRICE  	SOLD  


