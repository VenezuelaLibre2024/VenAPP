.class final Lvi/m$a;
.super Lvi/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvi/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Lvi/b$b;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lvi/b$a;

.field private final d:Lvi/r;

.field final synthetic e:Lvi/m;


# direct methods
.method public constructor <init>(Lvi/m;Lvi/b$b;Ljava/util/concurrent/Executor;Lvi/b$a;Lvi/r;)V
    .locals 0

    iput-object p1, p0, Lvi/m$a;->e:Lvi/m;

    invoke-direct {p0}, Lvi/b$a;-><init>()V

    iput-object p2, p0, Lvi/m$a;->a:Lvi/b$b;

    iput-object p3, p0, Lvi/m$a;->b:Ljava/util/concurrent/Executor;

    const-string p1, "delegate"

    invoke-static {p4, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/b$a;

    iput-object p1, p0, Lvi/m$a;->c:Lvi/b$a;

    const-string p1, "context"

    invoke-static {p5, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/r;

    iput-object p1, p0, Lvi/m$a;->d:Lvi/r;

    return-void
.end method
