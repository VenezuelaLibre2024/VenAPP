.class public final Lwk/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwk/h;->b(Lok/p;)Lwk/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwk/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lok/p;


# direct methods
.method public constructor <init>(Lok/p;)V
    .locals 0

    iput-object p1, p0, Lwk/h$a;->a:Lok/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lwk/h$a;->a:Lok/p;

    invoke-static {v0}, Lwk/g;->a(Lok/p;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
