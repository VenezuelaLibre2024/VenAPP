.class public final Lyl/f$d$a;
.super Lul/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyl/f$d;->o(ZLyl/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:Lyl/f;

.field final synthetic h:Lkotlin/jvm/internal/x;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLyl/f;Lkotlin/jvm/internal/x;)V
    .locals 0

    iput-object p1, p0, Lyl/f$d$a;->e:Ljava/lang/String;

    iput-boolean p2, p0, Lyl/f$d$a;->f:Z

    iput-object p3, p0, Lyl/f$d$a;->g:Lyl/f;

    iput-object p4, p0, Lyl/f$d$a;->h:Lkotlin/jvm/internal/x;

    invoke-direct {p0, p1, p2}, Lul/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    iget-object v0, p0, Lyl/f$d$a;->g:Lyl/f;

    invoke-virtual {v0}, Lyl/f;->c0()Lyl/f$c;

    move-result-object v0

    iget-object v1, p0, Lyl/f$d$a;->g:Lyl/f;

    iget-object v2, p0, Lyl/f$d$a;->h:Lkotlin/jvm/internal/x;

    iget-object v2, v2, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    check-cast v2, Lyl/m;

    invoke-virtual {v0, v1, v2}, Lyl/f$c;->a(Lyl/f;Lyl/m;)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
