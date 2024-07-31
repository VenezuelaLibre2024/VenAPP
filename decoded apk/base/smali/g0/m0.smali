.class public final synthetic Lg0/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/core/impl/r0;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/impl/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/m0;->a:Landroidx/camera/core/impl/r0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg0/m0;->a:Landroidx/camera/core/impl/r0;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r0;->e()V

    return-void
.end method
