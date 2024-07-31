.class public final synthetic Lio/flutter/plugins/imagepicker/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

.field public final synthetic b:I

.field public final synthetic c:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;ILandroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/b;->a:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    iput p2, p0, Lio/flutter/plugins/imagepicker/b;->b:I

    iput-object p3, p0, Lio/flutter/plugins/imagepicker/b;->c:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/b;->a:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    iget v1, p0, Lio/flutter/plugins/imagepicker/b;->b:I

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/b;->c:Landroid/content/Intent;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->e(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;ILandroid/content/Intent;)V

    return-void
.end method
