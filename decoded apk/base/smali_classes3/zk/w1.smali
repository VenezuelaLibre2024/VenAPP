.class public interface abstract Lzk/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk/f$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzk/w1$a;,
        Lzk/w1$b;
    }
.end annotation


# static fields
.field public static final q:Lzk/w1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lzk/w1$b;->a:Lzk/w1$b;

    sput-object v0, Lzk/w1;->q:Lzk/w1$b;

    return-void
.end method


# virtual methods
.method public abstract B0(Lgk/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract O(Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract R(Lok/l;)Lzk/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;)",
            "Lzk/c1;"
        }
    .end annotation
.end method

.method public abstract a()Z
.end method

.method public abstract getParent()Lzk/w1;
.end method

.method public abstract i()Lwk/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwk/d<",
            "Lzk/w1;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isCancelled()Z
.end method

.method public abstract j0(Lzk/u;)Lzk/s;
.end method

.method public abstract m0(ZZLok/l;)Lzk/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;)",
            "Lzk/c1;"
        }
    .end annotation
.end method

.method public abstract n()Ljava/util/concurrent/CancellationException;
.end method

.method public abstract start()Z
.end method
