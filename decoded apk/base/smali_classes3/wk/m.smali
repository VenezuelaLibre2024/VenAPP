.class public final Lwk/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lwk/d<",
        "TR;>;"
    }
.end annotation


# instance fields
.field private final a:Lwk/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwk/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "TT;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwk/d;Lok/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwk/d<",
            "+TT;>;",
            "Lok/l<",
            "-TT;+TR;>;)V"
        }
    .end annotation

    const-string v0, "sequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwk/m;->a:Lwk/d;

    iput-object p2, p0, Lwk/m;->b:Lok/l;

    return-void
.end method

.method public static final synthetic b(Lwk/m;)Lwk/d;
    .locals 0

    iget-object p0, p0, Lwk/m;->a:Lwk/d;

    return-object p0
.end method

.method public static final synthetic c(Lwk/m;)Lok/l;
    .locals 0

    iget-object p0, p0, Lwk/m;->b:Lok/l;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, Lwk/m$a;

    invoke-direct {v0, p0}, Lwk/m$a;-><init>(Lwk/m;)V

    return-object v0
.end method
