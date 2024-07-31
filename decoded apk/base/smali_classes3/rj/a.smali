.class abstract Lrj/a;
.super Ldj/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/o<",
        "TU;>;"
    }
.end annotation


# instance fields
.field protected final a:Ldj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/p<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ldj/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/p<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/o;-><init>()V

    iput-object p1, p0, Lrj/a;->a:Ldj/p;

    return-void
.end method
