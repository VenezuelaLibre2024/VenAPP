.class final Lgk/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgk/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgk/c$a$a;
    }
.end annotation


# static fields
.field public static final b:Lgk/c$a$a;

.field private static final serialVersionUID:J


# instance fields
.field private final a:[Lgk/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgk/c$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgk/c$a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lgk/c$a;->b:Lgk/c$a$a;

    return-void
.end method

.method public constructor <init>([Lgk/f;)V
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgk/c$a;->a:[Lgk/f;

    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lgk/c$a;->a:[Lgk/f;

    sget-object v1, Lgk/g;->a:Lgk/g;

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v1, v4}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
