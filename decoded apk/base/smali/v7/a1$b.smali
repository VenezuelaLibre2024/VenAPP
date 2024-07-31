.class public final Lv7/a1$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/a1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ls8/j$a;

.field private b:Ls8/d0;

.field private c:Z

.field private d:Ljava/lang/Object;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ls8/j$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls8/j$a;

    iput-object p1, p0, Lv7/a1$b;->a:Ls8/j$a;

    new-instance p1, Ls8/v;

    invoke-direct {p1}, Ls8/v;-><init>()V

    iput-object p1, p0, Lv7/a1$b;->b:Ls8/d0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv7/a1$b;->c:Z

    return-void
.end method


# virtual methods
.method public a(Lt6/c2$l;J)Lv7/a1;
    .locals 11

    new-instance v10, Lv7/a1;

    iget-object v1, p0, Lv7/a1$b;->e:Ljava/lang/String;

    iget-object v3, p0, Lv7/a1$b;->a:Ls8/j$a;

    iget-object v6, p0, Lv7/a1$b;->b:Ls8/d0;

    iget-boolean v7, p0, Lv7/a1$b;->c:Z

    iget-object v8, p0, Lv7/a1$b;->d:Ljava/lang/Object;

    const/4 v9, 0x0

    move-object v0, v10

    move-object v2, p1

    move-wide v4, p2

    invoke-direct/range {v0 .. v9}, Lv7/a1;-><init>(Ljava/lang/String;Lt6/c2$l;Ls8/j$a;JLs8/d0;ZLjava/lang/Object;Lv7/a1$a;)V

    return-object v10
.end method

.method public b(Ls8/d0;)Lv7/a1$b;
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ls8/v;

    invoke-direct {p1}, Ls8/v;-><init>()V

    :goto_0
    iput-object p1, p0, Lv7/a1$b;->b:Ls8/d0;

    return-object p0
.end method
