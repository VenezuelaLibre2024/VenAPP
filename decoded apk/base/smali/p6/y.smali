.class public final synthetic Lp6/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/m0$b;


# instance fields
.field public final synthetic a:Lp6/m0;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lh6/p;


# direct methods
.method public synthetic constructor <init>(Lp6/m0;Ljava/util/List;Lh6/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/y;->a:Lp6/m0;

    iput-object p2, p0, Lp6/y;->b:Ljava/util/List;

    iput-object p3, p0, Lp6/y;->c:Lh6/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lp6/y;->a:Lp6/m0;

    iget-object v1, p0, Lp6/y;->b:Ljava/util/List;

    iget-object v2, p0, Lp6/y;->c:Lh6/p;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lp6/m0;->Q(Lp6/m0;Ljava/util/List;Lh6/p;Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
