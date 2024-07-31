.class public interface abstract Lgk/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk/f$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgk/d$a;,
        Lgk/d$b;
    }
.end annotation


# static fields
.field public static final n:Lgk/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lgk/d$b;->a:Lgk/d$b;

    sput-object v0, Lgk/d;->n:Lgk/d$b;

    return-void
.end method


# virtual methods
.method public abstract E(Lgk/Continuation;)Lgk/Continuation;
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
.end method

.method public abstract h0(Lgk/Continuation;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "*>;)V"
        }
    .end annotation
.end method
