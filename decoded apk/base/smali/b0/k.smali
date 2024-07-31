.class public interface abstract Lb0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/u1;


# static fields
.field public static final E:Landroidx/camera/core/impl/n0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/n0$a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.thread.backgroundExecutor"

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/n0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/n0$a;

    move-result-object v0

    sput-object v0, Lb0/k;->E:Landroidx/camera/core/impl/n0$a;

    return-void
.end method


# virtual methods
.method public R(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lb0/k;->E:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p0, v0, p1}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    return-object p1
.end method
