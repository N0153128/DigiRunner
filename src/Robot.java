import java.util.*;
import java.io.*;


public class Robot{
	private final int init; // size of the block, required
	private final int divider; // decreases scope of the block, positive mod
	private final int multiplier; // increases scope of the block, negative mod
	private final int delay; // increases block size, negative mod
	private final int accel; // decreases block size, positive mod
	
	private Robot(Builder builder) {
		this.init = builder.init;
		this.divider = builder.divider;
		this.multiplier = builder.multiplier;
		this.delay = builder.delay;
		this.accel = builder.accel;
	}

// Getters are placed below
	public int getInit() {
		return init;
	}
	public int getDivider() {
		return divider;
	}

	public int getMultiplier() {
		return multiplier;
	}

	public int getDelay() {
		return delay;
	}

	public int getAccel() {
		return accel;
	}
// /getters

	public HashMap hexer() {
		HashMap<Integer, Integer> json = new HashMap<Integer, Integer>();
		int flag = 0;
		int block = this.init;
		if (this.delay > 0) {
			block = block * this.delay;
		} else if (this.accel > 0) {
			block = block / this.accel;
		}
		for (int i = 0; i < block; i++) {
			int flag1 = 0;
			while(flag1 == 0) {
				int a = 1 * (int)(Math.random() * 10);
				int b = 1 * (int)(Math.random() * 100);
				if (this.multiplier > 0){
					b = 1 + (int)(Math.random() * 100 * this.multiplier);
				} else if (this.divider > 0) {
					b = 1 + (int)(Math.random() * 100 / this.divider);
				} else if (this.divider == 0 && this.multiplier == 0){
					b = 1 + (int)(Math.random() * 100);
				}
				
				
				if (a == b) {
					json.put(i, a);
					flag1 = 1;
				}
			}
		}
		return json;
	}

	public static class Builder {
		private final int init;
		private int divider;
		private int multiplier;
		private int delay;
		private int accel;		
		
//		System.out.println("works?");


		public Builder (int init) {
			this.init = init;
		}

		public Builder divider (int divider) {
			this.divider = divider;
			return this;
		}

		public Builder multiplier(int multiplier) {
			this.multiplier = multiplier;
			return this;
		}

		public Builder delay(int delay) {
			this.delay = delay;
			return this;
		}

		public Builder accel(int accel) {
			this.accel = accel;
			return this;
		}

		public Robot build() {
			return new Robot(this);
		}
	
	} 

	public static void main(String[] args) {
		System.out.println("Hello world, starting shit");
		Robot robot = new Robot.Builder(10000)
			.delay(10)
			.build();

		System.out.println(robot.hexer());
		System.out.println();
		System.out.println(robot.getInit());
		System.out.println(robot.getDivider());
		System.out.println(robot.getMultiplier());
		System.out.println(robot.getDelay());
		System.out.println(robot.getAccel());
	}

}
