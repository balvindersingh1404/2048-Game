import java.util.Random;


public class Moves {

	void start(){
		Random rfield1;
		Random rvalue1;
		int initvalue[]={2,4};
		for(int i=0;i<2;i++){
			rfield1 = new Random();
			rvalue1 = new Random();
			try {
				InitWindow.label[rfield1.nextInt(16)].setText(Integer.toString(initvalue[rvalue1.nextInt(2)]));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}

	void left(){
		int i=0,j=0;
		int modvalue=0;

		for(i=0;i<4;i++){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j>0&&InitWindow.label[j-1].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j-1].getText());
						InitWindow.label[j-1].setText(Integer.toString(modvalue*2));
						if((j-1)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j++;
				}
			}

		}

		i=4;
		j=4;
		modvalue=0;

		for(i=4;i<8;i++){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j>4&&InitWindow.label[j-1].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j-1].getText());
						InitWindow.label[j-1].setText(Integer.toString(modvalue*2));
						if((j-1)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j++;
				}
			}

		}

		i=8;
		j=8;
		modvalue=0;

		for(i=8;i<12;i++){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j>8&&InitWindow.label[j-1].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j-1].getText());
						InitWindow.label[j-1].setText(Integer.toString(modvalue*2));
						if((j-1)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j++;
				}
			}

		}

		i=12;
		j=12;
		modvalue=0;

		for(i=12;i<16;i++){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j>12&&InitWindow.label[j-1].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j-1].getText());
						InitWindow.label[j-1].setText(Integer.toString(modvalue*2));
						if((j-1)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j++;
				}
			}

		}
		Random rfield1;
		Random rvalue1;
		int initvalue[]={2,4};
		rfield1 = new Random();
		rvalue1 = new Random();
		int field = rfield1.nextInt(16);
		while(InitWindow.label[field].getText().trim().length()!=0){field=rfield1.nextInt(16);}
		try {
			InitWindow.label[field].setText(Integer.toString(initvalue[rvalue1.nextInt(2)]));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

	}

	void right(){
		int i=3,j=3;
		int modvalue=0;

		for(i=3;i>=0;i--){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j<3&&InitWindow.label[j+1].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j+1].getText());
						InitWindow.label[j+1].setText(Integer.toString(modvalue*2));
						if((j+1)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j--;
				}
			}

		}

		i=7;
		j=7;
		modvalue=0;

		for(i=7;i>=4;i--){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j<7&&InitWindow.label[j+1].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j+1].getText());
						InitWindow.label[j+1].setText(Integer.toString(modvalue*2));
						if((j+1)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j--;
				}
			}

		}

		i=11;
		j=11;
		modvalue=0;

		for(i=11;i>=8;i--){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j<11&&InitWindow.label[j+1].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j+1].getText());
						InitWindow.label[j+1].setText(Integer.toString(modvalue*2));
						if((j+1)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j--;
				}
			}

		}

		i=15;
		j=15;
		modvalue=0;

		for(i=15;i>=12;i--){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j<15&&InitWindow.label[j+1].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j+1].getText());
						InitWindow.label[j+1].setText(Integer.toString(modvalue*2));
						if((j+1)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j--;
				}
			}

		}
		Random rfield1;
		Random rvalue1;
		int initvalue[]={2,4};
		rfield1 = new Random();
		rvalue1 = new Random();
		int field = rfield1.nextInt(16);
		while(InitWindow.label[field].getText().trim().length()!=0){field=rfield1.nextInt(16);}
		try {
			InitWindow.label[field].setText(Integer.toString(initvalue[rvalue1.nextInt(2)]));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

	}
	
	void up(){
		int i=0,j=0;
		int modvalue=0;

		for(i=0;i<13;i+=4){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j>0&&InitWindow.label[j-4].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j-4].getText());
						InitWindow.label[j-4].setText(Integer.toString(modvalue*2));
						if((j-4)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j+=4;
				}
			}

		}

		i=1;
		j=1;
		modvalue=0;

		for(i=1;i<14;i+=4){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j>1&&InitWindow.label[j-4].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j-4].getText());
						InitWindow.label[j-4].setText(Integer.toString(modvalue*2));
						if((j-4)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j+=4;
				}
			}

		}

		i=2;
		j=2;
		modvalue=0;

		for(i=2;i<15;i+=4){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j>2&&InitWindow.label[j-4].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j-4].getText());
						InitWindow.label[j-4].setText(Integer.toString(modvalue*2));
						if((j-4)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j+=4;
				}
			}

		}

		i=3;
		j=3;
		modvalue=0;

		for(i=3;i<16;i+=4){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j>3&&InitWindow.label[j-4].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j-4].getText());
						InitWindow.label[j-4].setText(Integer.toString(modvalue*2));
						if((j-4)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j+=4;
				}
			}

		}
		Random rfield1;
		Random rvalue1;
		int initvalue[]={2,4};
		rfield1 = new Random();
		rvalue1 = new Random();
		int field = rfield1.nextInt(16);
		while(InitWindow.label[field].getText().trim().length()!=0){field=rfield1.nextInt(16);}
		try {
			InitWindow.label[field].setText(Integer.toString(initvalue[rvalue1.nextInt(2)]));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

	}

	void down(){
		int i=12,j=12;
		int modvalue=0;

		for(i=12;i>=0;i-=4){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j<12&&InitWindow.label[j+4].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j+4].getText());
						InitWindow.label[j+4].setText(Integer.toString(modvalue*2));
						if((j+4)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j-=4;
				}
			}

		}

		i=13;
		j=13;
		modvalue=0;

		for(i=13;i>=1;i-=4){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j<13&&InitWindow.label[j+4].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j+4].getText());
						InitWindow.label[j+4].setText(Integer.toString(modvalue*2));
						if((j+4)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j-=4;
				}
			}

		}

		i=14;
		j=14;
		modvalue=0;

		for(i=14;i>=2;i-=4){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j<14&&InitWindow.label[j+4].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j+4].getText());
						InitWindow.label[j+4].setText(Integer.toString(modvalue*2));
						if((j+4)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j-=4;
				}
			}

		}

		i=15;
		j=15;
		modvalue=0;

		for(i=15;i>=3;i-=4){
			String num = InitWindow.label[i].getText();
			if(InitWindow.label[i].getText().trim().length()!=0){

				if(j<15&&InitWindow.label[j+4].getText().equals(num)){
					try {
						modvalue=Integer.parseInt(InitWindow.label[j+4].getText());
						InitWindow.label[j+4].setText(Integer.toString(modvalue*2));
						if((j+4)!=i){InitWindow.label[i].setText("");}
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}

				}

				else{
					InitWindow.label[j].setText(num);
					if(j!=i){InitWindow.label[i].setText("");}
					j-=4;
				}
			}

		}
		Random rfield1;
		Random rvalue1;
		int initvalue[]={2,4};
		rfield1 = new Random();
		rvalue1 = new Random();
		int field = rfield1.nextInt(16);
		while(InitWindow.label[field].getText().trim().length()!=0){field=rfield1.nextInt(16);}
		try {
			InitWindow.label[field].setText(Integer.toString(initvalue[rvalue1.nextInt(2)]));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

	}


}
