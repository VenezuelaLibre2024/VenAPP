.class public Lcom/mr/flutter/plugin/filepicker/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/PluginRegistry$ActivityResultListener;
.implements Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mr/flutter/plugin/filepicker/b$d;
    }
.end annotation


# static fields
.field private static final t:I


# instance fields
.field private final a:Landroid/app/Activity;

.field private final b:Lcom/mr/flutter/plugin/filepicker/b$d;

.field private c:Lio/flutter/plugin/common/MethodChannel$Result;

.field private d:Z

.field private e:Z

.field private f:Ljava/lang/String;

.field private r:[Ljava/lang/String;

.field private s:Lio/flutter/plugin/common/EventChannel$EventSink;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x2b

    const v1, 0xffff

    and-int/2addr v0, v1

    sput v0, Lcom/mr/flutter/plugin/filepicker/b;->t:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    new-instance v0, Lcom/mr/flutter/plugin/filepicker/b$a;

    invoke-direct {v0, p1}, Lcom/mr/flutter/plugin/filepicker/b$a;-><init>(Landroid/app/Activity;)V

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lcom/mr/flutter/plugin/filepicker/b;-><init>(Landroid/app/Activity;Lio/flutter/plugin/common/MethodChannel$Result;Lcom/mr/flutter/plugin/filepicker/b$d;)V

    return-void
.end method

.method constructor <init>(Landroid/app/Activity;Lio/flutter/plugin/common/MethodChannel$Result;Lcom/mr/flutter/plugin/filepicker/b$d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->d:Z

    iput-boolean v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->e:Z

    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/b;->a:Landroid/app/Activity;

    iput-object p2, p0, Lcom/mr/flutter/plugin/filepicker/b;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p3, p0, Lcom/mr/flutter/plugin/filepicker/b;->b:Lcom/mr/flutter/plugin/filepicker/b$d;

    return-void
.end method

.method static synthetic a(Lcom/mr/flutter/plugin/filepicker/b;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/mr/flutter/plugin/filepicker/b;->a:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic b(Lcom/mr/flutter/plugin/filepicker/b;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/mr/flutter/plugin/filepicker/b;->e:Z

    return p0
.end method

.method static synthetic c(Lcom/mr/flutter/plugin/filepicker/b;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/mr/flutter/plugin/filepicker/b;->l(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic d(Lcom/mr/flutter/plugin/filepicker/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/mr/flutter/plugin/filepicker/b;->f:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e(Lcom/mr/flutter/plugin/filepicker/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/mr/flutter/plugin/filepicker/b;->k(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic f(Lcom/mr/flutter/plugin/filepicker/b;Landroid/os/Bundle;)Ljava/util/ArrayList;
    .locals 0

    invoke-direct {p0, p1}, Lcom/mr/flutter/plugin/filepicker/b;->m(Landroid/os/Bundle;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Lcom/mr/flutter/plugin/filepicker/b;)Lio/flutter/plugin/common/EventChannel$EventSink;
    .locals 0

    iget-object p0, p0, Lcom/mr/flutter/plugin/filepicker/b;->s:Lio/flutter/plugin/common/EventChannel$EventSink;

    return-object p0
.end method

.method private h()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method

.method private i(Z)V
    .locals 2

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->s:Lio/flutter/plugin/common/EventChannel$EventSink;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->f:Ljava/lang/String;

    const-string v1, "dir"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/mr/flutter/plugin/filepicker/b$c;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/mr/flutter/plugin/filepicker/b$c;-><init>(Lcom/mr/flutter/plugin/filepicker/b;Landroid/os/Looper;Z)V

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_1
    :goto_0
    return-void
.end method

.method private static j(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 3

    const-string v0, "File picker is already active"

    const/4 v1, 0x0

    const-string v2, "already_active"

    invoke-interface {p0, v2, v0, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mr/flutter/plugin/filepicker/b;->i(Z)V

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 v1, 0x0

    invoke-interface {v0, p1, p2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/mr/flutter/plugin/filepicker/b;->h()V

    return-void
.end method

.method private l(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mr/flutter/plugin/filepicker/b;->i(Z)V

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mr/flutter/plugin/filepicker/a;

    invoke-virtual {v1}, Lcom/mr/flutter/plugin/filepicker/a;->a()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object p1, v0

    :cond_1
    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-interface {v0, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/mr/flutter/plugin/filepicker/b;->h()V

    :cond_2
    return-void
.end method

.method private m(Landroid/os/Bundle;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            ")",
            "Ljava/util/ArrayList<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const-string v2, "selectedItems"

    if-lt v0, v1, :cond_0

    const-class v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method private o(Lio/flutter/plugin/common/MethodChannel$Result;)Z
    .locals 1

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/b;->c:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 p1, 0x1

    return p1
.end method

.method private p()V
    .locals 5

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "dir"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "FilePickerDelegate"

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.OPEN_DOCUMENT_TREE"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1
    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->f:Ljava/lang/String;

    const-string v2, "image/*"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.PICK"

    sget-object v3, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_0

    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "android.intent.category.OPENABLE"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Selected type "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/mr/flutter/plugin/filepicker/b;->f:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v3, p0, Lcom/mr/flutter/plugin/filepicker/b;->f:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v2, p0, Lcom/mr/flutter/plugin/filepicker/b;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.extra.ALLOW_MULTIPLE"

    iget-boolean v3, p0, Lcom/mr/flutter/plugin/filepicker/b;->d:Z

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v2, "multi-pick"

    iget-boolean v3, p0, Lcom/mr/flutter/plugin/filepicker/b;->d:Z

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v2, p0, Lcom/mr/flutter/plugin/filepicker/b;->f:Ljava/lang/String;

    const-string v3, ","

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/mr/flutter/plugin/filepicker/b;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/mr/flutter/plugin/filepicker/b;->r:[Ljava/lang/String;

    :cond_3
    iget-object v2, p0, Lcom/mr/flutter/plugin/filepicker/b;->r:[Ljava/lang/String;

    if-eqz v2, :cond_4

    const-string v3, "android.intent.extra.MIME_TYPES"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    :cond_4
    :goto_1
    iget-object v2, p0, Lcom/mr/flutter/plugin/filepicker/b;->a:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v1, p0, Lcom/mr/flutter/plugin/filepicker/b;->a:Landroid/app/Activity;

    sget v2, Lcom/mr/flutter/plugin/filepicker/b;->t:I

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_2

    :cond_5
    const-string v0, "Can\'t find a valid activity to handle the request. Make sure you\'ve a file explorer installed."

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "invalid_format_type"

    const-string v1, "Can\'t handle the provided file type."

    invoke-direct {p0, v0, v1}, Lcom/mr/flutter/plugin/filepicker/b;->k(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-void
.end method


# virtual methods
.method public n(Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/b;->s:Lio/flutter/plugin/common/EventChannel$EventSink;

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 4

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/b;->f:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget v0, Lcom/mr/flutter/plugin/filepicker/b;->t:I

    const/4 v2, 0x1

    if-ne p1, v0, :cond_1

    const/4 v3, -0x1

    if-ne p2, v3, :cond_1

    invoke-direct {p0, v2}, Lcom/mr/flutter/plugin/filepicker/b;->i(Z)V

    new-instance p1, Ljava/lang/Thread;

    new-instance p2, Lcom/mr/flutter/plugin/filepicker/b$b;

    invoke-direct {p2, p0, p3}, Lcom/mr/flutter/plugin/filepicker/b$b;-><init>(Lcom/mr/flutter/plugin/filepicker/b;Landroid/content/Intent;)V

    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return v2

    :cond_1
    if-ne p1, v0, :cond_2

    if-nez p2, :cond_2

    const-string p1, "FilePickerDelegate"

    const-string p2, "User cancelled the picker request"

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/mr/flutter/plugin/filepicker/b;->l(Ljava/lang/Object;)V

    return v2

    :cond_2
    if-ne p1, v0, :cond_3

    const-string p1, "unknown_activity"

    const-string p2, "Unknown activity error, please fill an issue."

    invoke-direct {p0, p1, p2}, Lcom/mr/flutter/plugin/filepicker/b;->k(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return v1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    sget p2, Lcom/mr/flutter/plugin/filepicker/b;->t:I

    const/4 v0, 0x0

    if-eq p2, p1, :cond_0

    return v0

    :cond_0
    array-length p1, p3

    const/4 p2, 0x1

    if-lez p1, :cond_1

    aget p1, p3, v0

    if-nez p1, :cond_1

    move v0, p2

    :cond_1
    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/mr/flutter/plugin/filepicker/b;->p()V

    goto :goto_0

    :cond_2
    const-string p1, "read_external_storage_denied"

    const-string p3, "User did not allow reading external storage"

    invoke-direct {p0, p1, p3}, Lcom/mr/flutter/plugin/filepicker/b;->k(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return p2
.end method

.method public q(Ljava/lang/String;ZZ[Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    invoke-direct {p0, p5}, Lcom/mr/flutter/plugin/filepicker/b;->o(Lio/flutter/plugin/common/MethodChannel$Result;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p5}, Lcom/mr/flutter/plugin/filepicker/b;->j(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void

    :cond_0
    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/b;->f:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/mr/flutter/plugin/filepicker/b;->d:Z

    iput-boolean p3, p0, Lcom/mr/flutter/plugin/filepicker/b;->e:Z

    iput-object p4, p0, Lcom/mr/flutter/plugin/filepicker/b;->r:[Ljava/lang/String;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x21

    if-ge p1, p2, :cond_1

    iget-object p1, p0, Lcom/mr/flutter/plugin/filepicker/b;->b:Lcom/mr/flutter/plugin/filepicker/b$d;

    const-string p2, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-interface {p1, p2}, Lcom/mr/flutter/plugin/filepicker/b$d;->isPermissionGranted(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/mr/flutter/plugin/filepicker/b;->b:Lcom/mr/flutter/plugin/filepicker/b$d;

    sget p3, Lcom/mr/flutter/plugin/filepicker/b;->t:I

    invoke-interface {p1, p2, p3}, Lcom/mr/flutter/plugin/filepicker/b$d;->askForPermission(Ljava/lang/String;I)V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/mr/flutter/plugin/filepicker/b;->p()V

    return-void
.end method
