.class public final synthetic Lp/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/l2$c;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroidx/camera/core/impl/l2;
    .locals 0

    invoke-static {p1}, Landroidx/camera/camera2/Camera2Config;->a(Landroid/content/Context;)Landroidx/camera/core/impl/l2;

    move-result-object p1

    return-object p1
.end method