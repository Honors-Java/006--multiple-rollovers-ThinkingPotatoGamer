int width = 400;
int height = 400;

void setup() {
	size(400, 400);
  rectMode(CORNER);
}

void draw() {
	background(255);
	stroke(0);

  //start creating the lines
  line(width / 2, 0, width / 2, height);
  line(0, height / 2, width, height / 2);

  //Fill a black color
  fill(0);

  //Build your conditional statement 
	if(mouseX <= (width / 2)){
    if(mouseY <= height / 2){
      rect(0, 0, width/2, height/2);
    }else{
      rect(0, height/2, width/2, height/2);
    }
  }else{
    if(mouseY <= height / 2){
      rect(width/2, 0, width/2, height/2);
    }else{
      rect(width/2, height/2, width/2, height/2);
    }
    
  }


}