.class public final Lah/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lkg/b;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[",
            "Ldg/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkg/b;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkg/b;",
            "Ljava/util/List<",
            "[",
            "Ldg/s;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lah/b;->a:Lkg/b;

    iput-object p2, p0, Lah/b;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Lkg/b;
    .locals 1

    iget-object v0, p0, Lah/b;->a:Lkg/b;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[",
            "Ldg/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lah/b;->b:Ljava/util/List;

    return-object v0
.end method
