.class public final synthetic Landroidx/camera/core/impl/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/impl/r0;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/impl/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/impl/o0;->a:Landroidx/camera/core/impl/r0;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/o0;->a:Landroidx/camera/core/impl/r0;

    invoke-static {v0, p1}, Landroidx/camera/core/impl/r0;->c(Landroidx/camera/core/impl/r0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
