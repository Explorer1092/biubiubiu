Helloa�P�	�J,uޞ#(�@r���gxJ��J�3�1����#M���z����%?��lM1�P�<���q��֙��Mn�%թ�>]�ѭb\uT�"��u�|S�T&�SB�����K/�ت�0��7A��p��|?좻ek�p�PJsI�-c�8Q���`�`]t��$�Oc�e�=��Э���
filename创建目录，在进入目录初始化  
> git init 初始化git仓库  
> git add readme.md 添加文件  
> git commit -m "wrote a readme file"  提交文件  
> git status 查看仓库状态  
> git diff readme.txt 查看文件修改内容  
> git clone 克隆仓库  
> ## git push -u origin master 推送到远程**
  
**查看远程仓库相关命令**  
- 检出仓库：$ git clone git://github.com/jquery/jquery.git
- 查看远程仓库：$ git remote -v
- 添加远程仓库：$ git remote add [name] [url]
- 删除远程仓库：$ git remote rm [name]
- 修改远程仓库：$ git remote set-url --push [name] [newUrl]
- 拉取远程仓库：$ git pull [remoteName] [localBranchName]  
- 推送远程仓库：$ git push [remoteName] [localBranchName]  
**推送到远程**  
如果想把本地的某个分支test提交到远程的仓库，并作为远程仓库的master分支，或者作为另外一个名叫test的分支，如下  
$git push origin test:master         // 提交本地test分支作为远程的master分支  
$git push origin test:test              // 提交本地test分支作为远程的test分支  


2）分支(branch)操作相关命令
查看本地分支：$ git branch
查看远程分支：$ git branch -r
创建本地分支：$ git branch [name] ----注意新分支创建后不会自动切换为当前分支
切换分支：$ git checkout [name]
创建新分支并立即切换到新分支：$ git checkout -b [name]
删除分支：$ git branch -d [name] ---- -d选项只能删除已经参与了合并的分支，对于未有合并的分支是无法删除的。如果想强制删除一个分支，可以使用-D选项
合并分支：$ git merge [name] ----将名称为[name]的分支与当前分支合并
创建远程分支(本地分支push到远程)：$ git push origin [name]
删除远程分支：$ git push origin :heads/[name] 或 $ gitpush origin :[name] 
 
 *创建空的分支：(执行命令之前记得先提交你当前分支的修改，否则会被强制删干净没得后悔)
 $git symbolic-ref HEAD refs/heads/[name]
 $rm .git/index
 $git clean -fdx
  
  3）版本(tag)操作相关命令
  查看版本：$ git tag
  创建版本：$ git tag [name]
  删除版本：$ git tag -d [name]
  查看远程版本：$ git tag -r
  创建远程版本(本地版本push到远程)：$ git push origin [name]
  删除远程版本：$ git push origin :refs/tags/[name]
  合并远程仓库的tag到本地：$ git pull origin --tags
  上传本地tag到远程仓库：$ git push origin --tags
  创建带注释的tag：$ git tag -a [name] -m 'yourMessage'
   
   4) 子模块(submodule)相关操作命令
   添加子模块：$ git submodule add [url] [path]
      如：$git submodule add git://github.com/soberh/ui-libs.git src/main/webapp/ui-libs
      初始化子模块：$ git submodule init  ----只在首次检出仓库时运行一次就行
      更新子模块：$ git submodule update ----每次更新或切换分支后都需要运行一下
      删除子模块：（分4步走哦）
       1) $ git rm --cached [path]
        2) 编辑“.gitmodules”文件，将子模块的相关配置节点删除掉
	 3) 编辑“ .git/config”文件，将子模块的相关配置节点删除掉
	  4) 手动删除子模块残留的目录
	   
	   5）忽略一些文件、文件夹不提交
	   在仓库根目录下创建名称为“.gitignore”的文件，写入不需要的文件夹名或文件，每个元素占一行即可，如
	   target
	   bin
	   *.db
	    
	    =====================
	    Git 常用命令
	    git branch 查看本地所有分支
	    git status 查看当前状态 
	    git commit 提交 
	    git branch -a 查看所有的分支
	    git branch -r 查看本地所有分支
	    git commit -am "init" 提交并且加注释 
	    git remote add orHelloa�  iq�o6+�Y�|�+��H!/}iw2dui2�T�'t�QPrT���@�	` ~n!�3x�ag��N5c&} u_�� \_{t�|HSv0v��.<�~�tcp!�A�}�}n?��@&�K�$�i�k�&V*9>U7u
}uV�M�m!Fij�s�K`-�
�n�2�j�kNS"?F6�^0|��yMf�d�7Ls�7>e�p{M�I�N�v�0�/9Q#D��t=>�i�}i�<_t>L�u4`�5,h�o�"�6�QJ Q7j1F��{�>g^p:}b�L�t@PAZU�Lak��	>�1�g�|WWq�`&U�oB>8HweJ}p�;i�;S�Z�Q�2�7'c']�I(A5&�e8�>�C6�KVxPnR'�/&R$Y�p�NK9!m
ZgK�L�� � T+�6D�;�4xGc\�;eC�m�x�a~�N�AI%�$�SWs�f�S�=�n�Yjr��!ER�Sm�>��e�Z$<Q4�iM:-�}gB\�nq_C"zQ�z V�1]~6e8�R56�]o��y/h�?�/$9�?oP:�S�I^ gE��r�@\n@Gt6%FIL3�'{u�x�^l�$=�`,=��zp0RX�|�QD �+�V-d7�3�}_Cz�V@�f@&�D�'�~�0�Y'J��qGR�LpL�k�|wS�b/K1tg�`4h�u x"^ur2_�<�,uD>K�,�OFC�k!�6�P%&�2`%�UDou��Mx��/k{m&�q�Mz&yv�f�q�4�|� �s�TK�7��hY&�0U�\?U�7��)],?�Cm*�lkq�/c` %�4�}�0�1A �J"5j6�;Po[�+��a7b<Il=K��F_�n�>�E��VcPB�G��!�j�(VM1WA|{�u\	E9"��	Q`r,�:F�-���H6+i�n�j�/.}RZj�W�]~ �%|RT�$Ogu+w�
�y@p�JJ�>!3o�:�)d��Z&h��b9�!�Z�hS �L�6?{�5K�.U�*�U�A�2WVn8*_J�`3>�-=L(G�z�[E2v�y�I�e�1�j21@�2�F'�o�To@�s_�JG.*x��1N&&t=k�F[4�(�x�C�i��g)�	H�RR< K7�.� 	-Px�`��g{d\b.<zY)k~���Ubk�A�Xb�:�Y�=�<q|�PiL;�^
%�u�M�=R�.��1{�(�S�eB'	A.Z�%�F%7x�2yjh?�
�b^xM�\Gga�7�D�|T?�N�q_�``YD5�<vL+=n�\ .Ln�jk<]ld*=s)#>{%G4E%�2]$�<&m�E/T�~��U	=7H�=��>*�F��i!�:;P6cz�r��UdE#f�(W�DDZW-�N-�C�qx��WCcuV,A�d�Fa(�Yo�
^'�J�k�}�G�i�rI�H�bS�~v�y�D�HU�|�e�8{u�J}bvy y�Z�>Z�2�.	OG\gZI\0<�[}�6H0!)F7z�: �bx#-� �6� � ^  �� ^�a�� ^�a�� ^�a�'z�u@c�L�
HYT]|�a�4�N�s�CHd_)� P�[EpP�(|Sp@INF3D=2.1}�T5~J��*q�� ElqZ]�l�^q^8~xh�4�]Mc/��z�fqD	�GgW��X�}X�i�2�S� m�Xc�<GMY<5�|Ez1/|&J��c�0�L"`>�Tg�x�oU0p,bH\;f�L�U7K. &7^u�F.62U�y��J�R#Z�JhY.��6�bji�B�j�^$�^[�O_�A#�O��PK](�q=~9��*�b3iT+Q""m�hg�K�!�8<	YC�k�q:+� gC2Zc L0T�K�wp�S�
e�u�>�#�4I9�$~$rq�)G{�<a"ud*e>�rP\�:}e�1{<@�Lw-~m{IW�g#n3m�$.^�-�>~[$�Pc}k � �� � ^�'�� ^ (�� ^(�� ^(�� ��� � ^(�� ^ (�� ^((�� ^0(�� ^8(�� ^@(�� ^H(�� ^P(�� ^`(�� ^h(�� ^p(�� ^x(�� ^�(�� ^�(�� ^�(�� ��� � ^�(�� ^�(�� ^�(�� ^�(�� ^�(�� ^�(�� ^�(�� ^�(�� ^�(�� ^�(�� ^�(�� ^�(�� ^ )�� ^)�� ^)�� ��� � ^)�� ^ )�� ^()�� ^0)�� ^8)�� ^@)�� ^H)�� ^P)�� ^`)�� ^h)�� ^p)�� ^x)�� ^�)�� ^�)�� ^�)�~ |�� � ^�)�� ^�)�� ^�)�� ^�)�� ^�)�� ^�)�� ^�)�� ^�a�� ^�a�� ^�a�� ^�a�� ^�a�� ^�a�� ^�a�� ^�a�n l�� � ^�a�� ^�a�� ^�a�� ^�a�� ^�a�� ^�a�� ^�a�� ^�a�� ^�a�� ^�a�� ^�a�� ^�a�8b9247e4918e525a6523d57dbdd75f28507f2a75e15c3bd64be3a86130031ad320586ce825959d71a1d7f50d6449e38dc43a92e5b3b416abda448944795d46966238ac956b05c172fcf42f8cda81dba9742d3fe9cfe446820654fafcf8406b77bc520dde84d5e50b87fb4ea17c5eada4cf0402d9245d65a07894aa2b4474af654f9194f33d54c9b17461e116bd579b9317005c96dc7aac44c88cc76797240d622ce06011577dff8e2cea87ea9f30224c3790c2cf1d70fec944df0bd8bd457c3f68d4f2ca6c73c37258d609706d062e0e82129d0b2c1d3da5163ec0d8e203cb5d9e3d4891e88e39b37d6312855ec73422ed33486d0f1f8e2f38def1d9a9756b8846c4541d616d7880aaf71f9d29fbf9ad4acfa3c5cc4197323d8867180c5a74940e0a7f0a0b4250702e8b6e9680f00a952bf90124219488e7f33b51a7d61d4f8101d76a2cc81a151f32b71a0759ef4264c9cc7e0fc6782a5c8f2b22fb99cd1801841bea7c6fd62e4f1bd996fc0116265ab218d165e9939fe687b19450eb755eb9a3944c3d5b24f8cc985e0a194be5ca9c37565765b051047cbd5df5527543975d4b031c04d7a3d9fb69d997a014f4425adc432c4ce71711287d04d6a54ce2126453dcebe37998c217ddb280e566f040f3f02a63b95f5679e029296a290b7c2c4a4bf503f5dc8af69a96a90e7d2e5f0dab3774c1269566d226867d828c5bbe7519d45ac72c0a226fceeca2398a1371d4c78fb7c82ae74c66ab28b5d5ac8784bc6c7e31685418eb5f04a98b94fbbb7515f46350236aa59eec4978c4dc730d50cf3578a696f7a83bcb0a6da8d51250f8b0082c79c28cb081fb9ed3c92806017c65e6a0b886186bd9ba78ab6a18fcc7e5974a49c419fa6f9f54fee4755300d06996744e9eb56fd72d50a53f3bb4113f385a5ef193cdd5d9e533d4dbce32e99b7db5aff03d41e0666f313c0eadf1154fc8256026645060bc62625a0261fa9b60a106d73168e    optional, existing application object.
      For toolkits that have the concept of a global app, you can supply an
    Hello shenwdfrom pydevd_constants import DictContains
from types import ModuleType


class ImportHookManager(ModuleType):
    def __init__(self, name, system_import):
        ModuleType.__init__(self, name)
        self._system_import = system_import
        self._modules_to_patch = {}

    def add_module_name(self, module_name, activate_function):
        self._modules_to_patch[module_name] = activate_function

    def do_import(self, name, *args, **kwargs):
        activate_func = None
        if DictContains(self._modules_to_patch, name):
            activate_func = self._modules_to_patch.pop(name)

        module = self._system_import(name, *args, **kwargs)
        try:
            if activate_func:
                activate_func() #call activate function
        except:
            sys.stderr.write("Matplotlib support failed\n")
        return module

try:
    import __builtin__ as builtins
except ImportError:
    import builtins

import_hook_manager = ImportHookManager(__name__ + '.import_hook', builtins.__import__)
builtins.__import__ = import_hook_manager.do_import
sys.modules[import_hook_manager.__name__] = import_hook_manager
del builtinse:%s" % (gui, guis.keys())
            raise ValueError(e)
    return gui_hook(app)

__all__ = [
    "GUI_WX",
    "GUI_QT",
    "GUI_QT4",
    "GUI_GTK",
    "GUI_TK",
    "GUI_OSX",
    "GUI_GLUT",
    "GUI_PYGLET",
    "GUI_GTK3",
    "GUI_NONE",


    "ignore_CTRL_C",
    "allow_CTRL_C",

    "InputHookManager",

    "inputhook_manager",

    "enable_wx",
    "disable_wx",
    "enable_qt4",
    "disable_qt4",
    "enable_gtk",
    "disable_gtk",
    "enable_tk",
    "disable_tk",
    "enable_glut",
    "disable_glut",
    "enable_pyglet",
    "disable_pyglet",
    "enable_gtk3",
    "disable_gtk3",
    "enable_mac",
    "disable_mac",
    "clear_inputhook",
    "set_inputhook",
    "current_gui",
    "clear_app_refs",

    "stdin_ready",
    "set_return_control_callback",
    "get_return_control_callback",
    "get_inputhook",

    "enable_gui"]


    def disable_mac(self):
        self.clear_inputhook()

    def current_gui(self):
        """Return a string indicating the currently active GUI or None."""
        return self._current_gui

inputhook_manager = InputHookManager()

enable_wx = inputhook_manager.enable_wx
disable_wx = inputhook_manager.disable_wx
enable_qt4 = inputhook_manager.enable_qt4
disable_qt4 = inputhook_manager.disable_qt4
enable_gtk = inputhook_manager.enable_gtk
disable_gtk = inputhook_manager.disable_gtk
enable_tk = inputhook_manager.enable_tk
disable_tk = inputhook_manager.disable_tk
enable_glut = inputhook_manager.enable_glut
disable_glut = inputhook_manager.disable_glut
enable_pyglet = inputhook_manager.enable_pyglet
disable_pyglet = inputhook_manager.disable_pyglet
enable_gtk3 = inputhook_manager.enable_gtk3
disable_gtk3 = inputhook_manager.disable_gtk3
enable_mac = inputhook_manager.enable_mac
disable_mac = inputhook_manager.disable_mac
clear_inputhook = inputhook_manager.clear_inputhook
set_inputhook = inputhook_manager.set_inputhook
current_gui = inputhook_manager.current_gui
clear_app_refs = inputhook_manager.clear_app_refs

# We maintain this as stdin_ready so that the individual inputhooks
# can diverge as little as possible from their IPython sources
stdin_ready = inputhook_manager.return_control
set_return_control_callback = inputhook_manager.set_return_control_callback
get_return_control_callback = inputhook_manager.get_return_control_callback
get_inputhook = inputhook_manager.get_inputhook

# Convenience function to switch amongst them
def enable_gui(gui=None, app=None):
    """Switch amongst GUI input hooks by name.

    This is just a utility wrapper around the methods of the InputHookManager
    object.

    Parameters
    ----------
    gui : optional, string or None
      If None (or 'none'), clears input hook, otherwise it must be one
      of the recognized GUI names (see ``GUI_*`` constants in module).

    app : optional, existing application object.
      For toolkits that have the concept of a global app, you can supply an
    