.class Lk2/k$b;
.super Lr1/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk2/k;-><init>(Lr1/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lk2/k;


# direct methods
.method constructor <init>(Lk2/k;Lr1/u;)V
    .locals 0

    iput-object p1, p0, Lk2/k$b;->d:Lk2/k;

    invoke-direct {p0, p2}, Lr1/d0;-><init>(Lr1/u;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?"

    return-object v0
.end method
