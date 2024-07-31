.class public final Lul/c;
.super Lul/a;
.source "SourceFile"


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:Lok/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/a<",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLok/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lok/a<",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lul/c;->e:Ljava/lang/String;

    iput-boolean p2, p0, Lul/c;->f:Z

    iput-object p3, p0, Lul/c;->g:Lok/a;

    invoke-direct {p0, p1, p2}, Lul/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    iget-object v0, p0, Lul/c;->g:Lok/a;

    invoke-interface {v0}, Lok/a;->invoke()Ljava/lang/Object;

    const-wide/16 v0, -0x1

    return-wide v0
.end method
