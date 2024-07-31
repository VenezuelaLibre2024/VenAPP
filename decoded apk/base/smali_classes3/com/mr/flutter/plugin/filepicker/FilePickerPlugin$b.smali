.class Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/MethodChannel$Result;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lio/flutter/plugin/common/MethodChannel$Result;

.field private final b:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;->b:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;)Lio/flutter/plugin/common/MethodChannel$Result;
    .locals 0

    iget-object p0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    return-object p0
.end method


# virtual methods
.method public error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;->b:Landroid/os/Handler;

    new-instance v1, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b$b;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b$b;-><init>(Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public notImplemented()V
    .locals 2

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;->b:Landroid/os/Handler;

    new-instance v1, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b$c;

    invoke-direct {v1, p0}, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b$c;-><init>(Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public success(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;->b:Landroid/os/Handler;

    new-instance v1, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b$a;

    invoke-direct {v1, p0, p1}, Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b$a;-><init>(Lcom/mr/flutter/plugin/filepicker/FilePickerPlugin$b;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
