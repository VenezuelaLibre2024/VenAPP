.class public abstract Lzk/h0;
.super Lgk/a;
.source "SourceFile"

# interfaces
.implements Lgk/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzk/h0$a;
    }
.end annotation


# static fields
.field public static final b:Lzk/h0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzk/h0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzk/h0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lzk/h0;->b:Lzk/h0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lgk/d;->n:Lgk/d$b;

    invoke-direct {p0, v0}, Lgk/a;-><init>(Lgk/f$c;)V

    return-void
.end method


# virtual methods
.method public abstract D0(Lgk/f;Ljava/lang/Runnable;)V
.end method

.method public final E(Lgk/Continuation;)Lgk/Continuation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lgk/Continuation<",
            "-TT;>;)",
            "Lgk/Continuation<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lel/j;

    invoke-direct {v0, p0, p1}, Lel/j;-><init>(Lzk/h0;Lgk/Continuation;)V

    return-object v0
.end method

.method public F0(Lgk/f;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public H0(I)Lzk/h0;
    .locals 1

    invoke-static {p1}, Lel/p;->a(I)V

    new-instance v0, Lel/o;

    invoke-direct {v0, p0, p1}, Lel/o;-><init>(Lzk/h0;I)V

    return-object v0
.end method

.method public Q(Lgk/f$c;)Lgk/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/f$c<",
            "*>;)",
            "Lgk/f;"
        }
    .end annotation

    invoke-static {p0, p1}, Lgk/d$a;->b(Lgk/d;Lgk/f$c;)Lgk/f;

    move-result-object p1

    return-object p1
.end method

.method public b(Lgk/f$c;)Lgk/f$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lgk/f$b;",
            ">(",
            "Lgk/f$c<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, Lgk/d$a;->a(Lgk/d;Lgk/f$c;)Lgk/f$b;

    move-result-object p1

    return-object p1
.end method

.method public final h0(Lgk/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lel/j;

    invoke-virtual {p1}, Lel/j;->r()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lzk/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lzk/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
