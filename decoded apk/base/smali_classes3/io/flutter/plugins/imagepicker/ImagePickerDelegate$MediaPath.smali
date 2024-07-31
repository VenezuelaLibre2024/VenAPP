.class public Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/ImagePickerDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MediaPath"
.end annotation


# instance fields
.field final mimeType:Ljava/lang/String;

.field final path:Ljava/lang/String;

.field final synthetic this$0:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;->this$0:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;->path:Ljava/lang/String;

    iput-object p3, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;->mimeType:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getMimeType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;->mimeType:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerDelegate$MediaPath;->path:Ljava/lang/String;

    return-object v0
.end method
