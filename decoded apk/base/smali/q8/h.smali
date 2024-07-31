.class public final synthetic Lq8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq8/m$h$a;


# instance fields
.field public final synthetic a:Lq8/m$d;

.field public final synthetic b:[I


# direct methods
.method public synthetic constructor <init>(Lq8/m$d;[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq8/h;->a:Lq8/m$d;

    iput-object p2, p0, Lq8/h;->b:[I

    return-void
.end method


# virtual methods
.method public final a(ILv7/d1;[I)Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lq8/h;->a:Lq8/m$d;

    iget-object v1, p0, Lq8/h;->b:[I

    invoke-static {v0, v1, p1, p2, p3}, Lq8/m;->o(Lq8/m$d;[IILv7/d1;[I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
