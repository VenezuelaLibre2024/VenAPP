.class public final Lk6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk6/b$a;
    }
.end annotation


# static fields
.field private static final b:Lk6/b;


# instance fields
.field private final a:Lk6/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk6/b$a;

    invoke-direct {v0}, Lk6/b$a;-><init>()V

    invoke-virtual {v0}, Lk6/b$a;->a()Lk6/b;

    move-result-object v0

    sput-object v0, Lk6/b;->b:Lk6/b;

    return-void
.end method

.method constructor <init>(Lk6/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/b;->a:Lk6/e;

    return-void
.end method

.method public static b()Lk6/b$a;
    .locals 1

    new-instance v0, Lk6/b$a;

    invoke-direct {v0}, Lk6/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lk6/e;
    .locals 1
    .annotation build Lmd/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lk6/b;->a:Lk6/e;

    return-object v0
.end method
