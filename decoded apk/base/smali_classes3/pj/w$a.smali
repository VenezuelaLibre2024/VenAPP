.class final Lpj/w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lim/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lim/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lpj/w$c<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private final b:I


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lpj/w$c<",
            "TT;>;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj/w$a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput p2, p0, Lpj/w$a;->b:I

    return-void
.end method


# virtual methods
.method public a(Lim/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Lpj/w$b;

    invoke-direct {v0, p1}, Lpj/w$b;-><init>(Lim/b;)V

    invoke-interface {p1, v0}, Lim/b;->d(Lim/c;)V

    :cond_0
    :goto_0
    iget-object p1, p0, Lpj/w$a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpj/w$c;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lpj/w$c;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_1
    new-instance v1, Lpj/w$c;

    iget-object v2, p0, Lpj/w$a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iget v3, p0, Lpj/w$a;->b:I

    invoke-direct {v1, v2, v3}, Lpj/w$c;-><init>(Ljava/util/concurrent/atomic/AtomicReference;I)V

    iget-object v2, p0, Lpj/w$a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, p1, v1}, Le2/c;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v1

    :cond_3
    invoke-virtual {p1, v0}, Lpj/w$c;->b(Lpj/w$b;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v1, v1, v3

    if-nez v1, :cond_4

    invoke-virtual {p1, v0}, Lpj/w$c;->i(Lpj/w$b;)V

    goto :goto_1

    :cond_4
    iput-object p1, v0, Lpj/w$b;->b:Lpj/w$c;

    :goto_1
    invoke-virtual {p1}, Lpj/w$c;->g()V

    return-void
.end method
