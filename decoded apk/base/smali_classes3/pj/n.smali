.class public final Lpj/n;
.super Ldj/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/n$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/f<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final b:Ldj/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/o<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/o<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/f;-><init>()V

    iput-object p1, p0, Lpj/n;->b:Ldj/o;

    return-void
.end method


# virtual methods
.method protected I(Lim/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpj/n;->b:Ldj/o;

    new-instance v1, Lpj/n$a;

    invoke-direct {v1, p1}, Lpj/n$a;-><init>(Lim/b;)V

    invoke-virtual {v0, v1}, Ldj/o;->d(Ldj/q;)V

    return-void
.end method
