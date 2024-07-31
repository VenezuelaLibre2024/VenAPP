.class Lk2/s$c;
.super Lr1/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk2/s;-><init>(Lr1/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lk2/s;


# direct methods
.method constructor <init>(Lk2/s;Lr1/u;)V
    .locals 0

    iput-object p1, p0, Lk2/s$c;->d:Lk2/s;

    invoke-direct {p0, p2}, Lr1/d0;-><init>(Lr1/u;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM WorkProgress"

    return-object v0
.end method
