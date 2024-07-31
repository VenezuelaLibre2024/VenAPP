.class Lb2/p$a;
.super Lb2/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb2/p;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb2/l;

.field final synthetic b:Lb2/p;


# direct methods
.method constructor <init>(Lb2/p;Lb2/l;)V
    .locals 0

    iput-object p1, p0, Lb2/p$a;->b:Lb2/p;

    iput-object p2, p0, Lb2/p$a;->a:Lb2/l;

    invoke-direct {p0}, Lb2/m;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lb2/l;)V
    .locals 1

    iget-object v0, p0, Lb2/p$a;->a:Lb2/l;

    invoke-virtual {v0}, Lb2/l;->X()V

    invoke-virtual {p1, p0}, Lb2/l;->T(Lb2/l$f;)Lb2/l;

    return-void
.end method
