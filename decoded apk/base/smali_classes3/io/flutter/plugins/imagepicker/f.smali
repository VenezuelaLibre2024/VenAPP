.class public final synthetic Lio/flutter/plugins/imagepicker/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/f;->a:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    iput p2, p0, Lio/flutter/plugins/imagepicker/f;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/f;->a:Lio/flutter/plugins/imagepicker/ImagePickerDelegate;

    iget v1, p0, Lio/flutter/plugins/imagepicker/f;->b:I

    invoke-static {v0, v1}, Lio/flutter/plugins/imagepicker/ImagePickerDelegate;->c(Lio/flutter/plugins/imagepicker/ImagePickerDelegate;I)V

    return-void
.end method
