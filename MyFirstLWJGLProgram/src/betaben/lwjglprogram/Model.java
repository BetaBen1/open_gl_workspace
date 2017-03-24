package betaben.lwjglprogram;

import java.nio.FloatBuffer;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.GL15.*;

public class Model {

	private int draw_count;
	private int v_id;

	public Model(float[] vertices){
		
		draw_count = vertices.length/3;
		
		FloatBuffer buffer = BufferUtils.createFloatBuffer(vertices.length);
		buffer.put(vertices);
		
		v_id = glGenBuffers();
		glBindBuffer(GL_ARRAY_BUFFER, v_id);
		glBufferData(GL_ARRAY_BUFFER, buffer, GL_STATIC_DRAW);
		glBindBuffer(GL_ARRAY_BUFFER, 0);
		
	}
	
	public void render(){
		
	}
	
}
