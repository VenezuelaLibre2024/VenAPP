.class final Lr1/d$a$h;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr1/d$a;->N0(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Lv1/i;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Landroid/content/ContentValues;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:[Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lr1/d$a$h;->a:Ljava/lang/String;

    iput p2, p0, Lr1/d$a$h;->b:I

    iput-object p3, p0, Lr1/d$a$h;->c:Landroid/content/ContentValues;

    iput-object p4, p0, Lr1/d$a$h;->d:Ljava/lang/String;

    iput-object p5, p0, Lr1/d$a$h;->e:[Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lv1/i;)Ljava/lang/Integer;
    .locals 7

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lr1/d$a$h;->a:Ljava/lang/String;

    iget v3, p0, Lr1/d$a$h;->b:I

    iget-object v4, p0, Lr1/d$a$h;->c:Landroid/content/ContentValues;

    iget-object v5, p0, Lr1/d$a$h;->d:Ljava/lang/String;

    iget-object v6, p0, Lr1/d$a$h;->e:[Ljava/lang/Object;

    move-object v1, p1

    invoke-interface/range {v1 .. v6}, Lv1/i;->N0(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv1/i;

    invoke-virtual {p0, p1}, Lr1/d$a$h;->a(Lv1/i;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
