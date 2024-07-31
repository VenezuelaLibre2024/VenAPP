.class final Lqj/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field final a:Ldj/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/l<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:Ldj/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/n<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ldj/l;Ldj/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;",
            "Ldj/n<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqj/r$b;->a:Ldj/l;

    iput-object p2, p0, Lqj/r$b;->b:Ldj/n;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lqj/r$b;->b:Ldj/n;

    iget-object v1, p0, Lqj/r$b;->a:Ldj/l;

    invoke-interface {v0, v1}, Ldj/n;->a(Ldj/l;)V

    return-void
.end method
