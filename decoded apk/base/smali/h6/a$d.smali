.class final Lh6/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd/d<",
        "Lk6/d;",
        ">;"
    }
.end annotation


# static fields
.field static final a:Lh6/a$d;

.field private static final b:Ljd/c;

.field private static final c:Ljd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh6/a$d;

    invoke-direct {v0}, Lh6/a$d;-><init>()V

    sput-object v0, Lh6/a$d;->a:Lh6/a$d;

    const-string v0, "logSource"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lh6/a$d;->b:Ljd/c;

    const-string v0, "logEventDropped"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lh6/a$d;->c:Ljd/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lk6/d;Ljd/e;)V
    .locals 2

    sget-object v0, Lh6/a$d;->b:Ljd/c;

    invoke-virtual {p1}, Lk6/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lh6/a$d;->c:Ljd/c;

    invoke-virtual {p1}, Lk6/d;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method public bridge synthetic encode(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lk6/d;

    check-cast p2, Ljd/e;

    invoke-virtual {p0, p1, p2}, Lh6/a$d;->a(Lk6/d;Ljd/e;)V

    return-void
.end method
