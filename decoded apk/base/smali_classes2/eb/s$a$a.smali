.class Leb/s$a$a;
.super Leb/s$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leb/s$a;->b(Leb/s;Ljava/lang/CharSequence;)Leb/s$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic s:Leb/s$a;


# direct methods
.method constructor <init>(Leb/s$a;Leb/s;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Leb/s$a$a;->s:Leb/s$a;

    invoke-direct {p0, p2, p3}, Leb/s$b;-><init>(Leb/s;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method f(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method g(I)I
    .locals 2

    iget-object v0, p0, Leb/s$a$a;->s:Leb/s$a;

    iget-object v0, v0, Leb/s$a;->a:Leb/d;

    iget-object v1, p0, Leb/s$b;->c:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, p1}, Leb/d;->c(Ljava/lang/CharSequence;I)I

    move-result p1

    return p1
.end method
