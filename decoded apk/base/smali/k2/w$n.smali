.class Lk2/w$n;
.super Lr1/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk2/w;-><init>(Lr1/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lk2/w;


# direct methods
.method constructor <init>(Lk2/w;Lr1/u;)V
    .locals 0

    iput-object p1, p0, Lk2/w$n;->d:Lk2/w;

    invoke-direct {p0, p2}, Lr1/d0;-><init>(Lr1/u;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE workspec SET run_attempt_count=0 WHERE id=?"

    return-object v0
.end method
