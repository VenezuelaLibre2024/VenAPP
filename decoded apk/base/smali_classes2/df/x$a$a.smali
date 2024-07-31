.class final Ldf/x$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcl/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf/x$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcl/c;"
    }
.end annotation


# instance fields
.field final synthetic a:Ldf/x;


# direct methods
.method constructor <init>(Ldf/x;)V
    .locals 0

    iput-object p1, p0, Ldf/x$a$a;->a:Ldf/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldf/l;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf/l;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Ldf/x$a$a;->a:Ldf/x;

    invoke-static {p2}, Ldf/x;->e(Ldf/x;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldf/l;

    invoke-virtual {p0, p1, p2}, Ldf/x$a$a;->a(Ldf/l;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
