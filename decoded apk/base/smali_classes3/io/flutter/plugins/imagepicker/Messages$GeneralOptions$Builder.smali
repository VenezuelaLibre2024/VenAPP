.class public final Lio/flutter/plugins/imagepicker/Messages$GeneralOptions$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/Messages$GeneralOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private allowMultiple:Ljava/lang/Boolean;

.field private usePhotoPicker:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lio/flutter/plugins/imagepicker/Messages$GeneralOptions;
    .locals 2

    new-instance v0, Lio/flutter/plugins/imagepicker/Messages$GeneralOptions;

    invoke-direct {v0}, Lio/flutter/plugins/imagepicker/Messages$GeneralOptions;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/Messages$GeneralOptions$Builder;->allowMultiple:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/imagepicker/Messages$GeneralOptions;->setAllowMultiple(Ljava/lang/Boolean;)V

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/Messages$GeneralOptions$Builder;->usePhotoPicker:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/imagepicker/Messages$GeneralOptions;->setUsePhotoPicker(Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public setAllowMultiple(Ljava/lang/Boolean;)Lio/flutter/plugins/imagepicker/Messages$GeneralOptions$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/Messages$GeneralOptions$Builder;->allowMultiple:Ljava/lang/Boolean;

    return-object p0
.end method

.method public setUsePhotoPicker(Ljava/lang/Boolean;)Lio/flutter/plugins/imagepicker/Messages$GeneralOptions$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/Messages$GeneralOptions$Builder;->usePhotoPicker:Ljava/lang/Boolean;

    return-object p0
.end method
