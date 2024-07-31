.class public final Lyl/f$d$d;
.super Lul/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyl/f$d;->f(ZLyl/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:Lyl/f$d;

.field final synthetic h:Z

.field final synthetic i:Lyl/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLyl/f$d;ZLyl/m;)V
    .locals 0

    iput-object p1, p0, Lyl/f$d$d;->e:Ljava/lang/String;

    iput-boolean p2, p0, Lyl/f$d$d;->f:Z

    iput-object p3, p0, Lyl/f$d$d;->g:Lyl/f$d;

    iput-boolean p4, p0, Lyl/f$d$d;->h:Z

    iput-object p5, p0, Lyl/f$d$d;->i:Lyl/m;

    invoke-direct {p0, p1, p2}, Lul/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    iget-object v0, p0, Lyl/f$d$d;->g:Lyl/f$d;

    iget-boolean v1, p0, Lyl/f$d$d;->h:Z

    iget-object v2, p0, Lyl/f$d$d;->i:Lyl/m;

    invoke-virtual {v0, v1, v2}, Lyl/f$d;->o(ZLyl/m;)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method
