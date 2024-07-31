.class public final Lv9/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lv9/j;

.field private b:Ljava/lang/String;

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lv9/g;
    .locals 4

    new-instance v0, Lv9/g;

    iget-object v1, p0, Lv9/g$a;->a:Lv9/j;

    iget-object v2, p0, Lv9/g$a;->b:Ljava/lang/String;

    iget v3, p0, Lv9/g$a;->c:I

    invoke-direct {v0, v1, v2, v3}, Lv9/g;-><init>(Lv9/j;Ljava/lang/String;I)V

    return-object v0
.end method

.method public b(Lv9/j;)Lv9/g$a;
    .locals 0

    iput-object p1, p0, Lv9/g$a;->a:Lv9/j;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lv9/g$a;
    .locals 0

    iput-object p1, p0, Lv9/g$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final d(I)Lv9/g$a;
    .locals 0

    iput p1, p0, Lv9/g$a;->c:I

    return-object p0
.end method
