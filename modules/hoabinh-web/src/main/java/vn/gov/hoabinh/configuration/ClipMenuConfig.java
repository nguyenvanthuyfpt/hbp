package vn.gov.hoabinh.configuration;

import aQute.bnd.annotation.metatype.Meta;

@Meta.OCD(id = "vn.gov.hoabinh.configuration.ClipMenuConfig")
public interface ClipMenuConfig {
	@Meta.AD(required = false)
	public String plidSelected();
	
	@Meta.AD(required = false)
	public String pageSelected();

	@Meta.AD(required = false)
	public String portletSelected();
	
	@Meta.AD(required = false)
	public String categorySel();
	
	@Meta.AD(required = false)
	public String styleSel();
}
