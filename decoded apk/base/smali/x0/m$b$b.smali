.class public final Lx0/m$b$b;
.super Lx0/m$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/m$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lx0/m$b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lok/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/p<",
            "TT;",
            "Lgk/Continuation<",
            "-TT;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lzk/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzk/v<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final c:Lx0/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/n<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final d:Lgk/f;


# direct methods
.method public constructor <init>(Lok/p;Lzk/v;Lx0/n;Lgk/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/p<",
            "-TT;-",
            "Lgk/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lzk/v<",
            "TT;>;",
            "Lx0/n<",
            "TT;>;",
            "Lgk/f;",
            ")V"
        }
    .end annotation

    const-string v0, "transform"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callerContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lx0/m$b;-><init>(Lkotlin/jvm/internal/g;)V

    iput-object p1, p0, Lx0/m$b$b;->a:Lok/p;

    iput-object p2, p0, Lx0/m$b$b;->b:Lzk/v;

    iput-object p3, p0, Lx0/m$b$b;->c:Lx0/n;

    iput-object p4, p0, Lx0/m$b$b;->d:Lgk/f;

    return-void
.end method


# virtual methods
.method public final a()Lzk/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lzk/v<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lx0/m$b$b;->b:Lzk/v;

    return-object v0
.end method

.method public final b()Lgk/f;
    .locals 1

    iget-object v0, p0, Lx0/m$b$b;->d:Lgk/f;

    return-object v0
.end method

.method public c()Lx0/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx0/n<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lx0/m$b$b;->c:Lx0/n;

    return-object v0
.end method

.method public final d()Lok/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lok/p<",
            "TT;",
            "Lgk/Continuation<",
            "-TT;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx0/m$b$b;->a:Lok/p;

    return-object v0
.end method
