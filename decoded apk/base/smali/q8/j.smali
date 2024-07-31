.class public final synthetic Lq8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq8/m$h$a;


# instance fields
.field public final synthetic a:Lq8/m;

.field public final synthetic b:Lq8/m$d;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lq8/m;Lq8/m$d;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq8/j;->a:Lq8/m;

    iput-object p2, p0, Lq8/j;->b:Lq8/m$d;

    iput-boolean p3, p0, Lq8/j;->c:Z

    return-void
.end method


# virtual methods
.method public final a(ILv7/d1;[I)Ljava/util/List;
    .locals 6

    iget-object v0, p0, Lq8/j;->a:Lq8/m;

    iget-object v1, p0, Lq8/j;->b:Lq8/m$d;

    iget-boolean v2, p0, Lq8/j;->c:Z

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Lq8/m;->q(Lq8/m;Lq8/m$d;ZILv7/d1;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
